package daniel.lop.io.marvelappstarter.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import daniel.lop.io.marvelappstarter.databinding.FragmentListCharacterBinding
import daniel.lop.io.marvelappstarter.ui.base.BaseFragment

// Esta classe representa um fragmento na aplicação Android que exibe uma lista de personagens.
// Ela estende a classe BaseFragment, que é uma classe genérica que recebe dois parâmetros de tipo:
// FragmentListCharacterBinding e ListCharacterViewModel.
class ListCharacterFragment : BaseFragment<FragmentListCharacterBinding, ListCharacterViewModel>() {

    // A propriedade viewModel é inicializada usando o delegate viewModels, que fornece um ViewModel com escopo para este Fragment.
    override val viewModel: ListCharacterViewModel by viewModels()

    // Este método é responsável por inflar o layout para este fragmento.
    // Ele usa a classe FragmentListCharacterBinding para inflar o layout e retornar o objeto de binding.
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListCharacterBinding = FragmentListCharacterBinding.inflate(inflater, container, false)
}