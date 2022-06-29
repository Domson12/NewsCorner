package eu.tuto.newscorner

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import eu.tuto.newscorner.databinding.FragmentInfoBinding
import eu.tuto.newscorner.presentation.viewmodel.NewsViewModel

class InfoFragment : Fragment() {
    private lateinit var fragmentInfoBinding: FragmentInfoBinding
    private lateinit var viewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentInfoBinding = FragmentInfoBinding.bind(view)
        val args: InfoFragmentArgs by navArgs()
        val article = args.selectedArticle
        val progressBar = fragmentInfoBinding.infoProgressBar
        viewModel = (activity as MainActivity).viewModel

        fragmentInfoBinding.wwInfo.apply {
            webViewClient = object : WebViewClient() {
                override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                    super.onPageStarted(view, url, favicon)
                    progressBar.visibility = View.VISIBLE
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    progressBar.visibility = View.INVISIBLE
                }
            }

            if (article.url?.isNotEmpty() == true) {
                loadUrl(article.url.toString())
            }
            fragmentInfoBinding.fabSave.setOnClickListener {
                viewModel.saveArticle(article)

                Snackbar.make(view, "Zapisano pomyślnie", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}
