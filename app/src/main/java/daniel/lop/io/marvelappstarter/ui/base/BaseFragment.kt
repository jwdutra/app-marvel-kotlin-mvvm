package daniel.lop.io.marvelappstarter.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import dagger.hilt.android.AndroidEntryPoint

// BaseFragment é uma classe abstrata que serve como base para todos os fragments no aplicativo.
// Ela usa genéricos para garantir o uso de um tipo específico de ViewBinding e ViewModel.
abstract class BaseFragment<VB: ViewBinding, VM: ViewModel>: Fragment() {

    // Propriedade de apoio para a instância de ViewBinding.
    private var _binding: VB? = null

    // Propriedade publicamente acessível para obter a instância de ViewBinding.
    // O operador de dupla exclamação (!!) é usado para afirmar que o valor não é nulo.
    protected val binding get() = _binding!!

    // Propriedade abstrata que deve ser implementada pelas subclasses para fornecer a instância de ViewModel.
    protected abstract val viewModel: VM

    // Chamado para que o fragmento instancie sua interface de usuário.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout usando a instância fornecida de ViewBinding.
        _binding = getViewBinding(inflater, container)
        // Retorna a raiz da view do layout inflado.
        return binding.root
    }

    // Método abstrato que deve ser implementado pelas subclasses para fornecer a instância de ViewBinding.
    protected abstract fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): VB

    // Chamado quando a view criada anteriormente por onCreateView foi desanexada do fragmento.
    override fun onDestroyView() {
        super.onDestroyView()
        // Limpa a instância de ViewBinding para evitar vazamentos de memória.
        _binding = null
    }
}