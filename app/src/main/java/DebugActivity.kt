/**
 * Created by viktor on 11/11/17.
 */
package helloandroid.br.com.helloandroid
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

open class DebugActivity : AppCompatActivity(){
    private val TAG = "livro"
    private val className: String
        get(){
            val s = javaClass.name
            return s.substring(s.lastIndexOf("."))
        }

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        Log.d(TAG, className + ".onCreate() Chamado: " + icicle)
    }
    override fun onStart(){
        super.onStart()
        Log.d(TAG, className + ".onStart() Chamado")
    }
    override fun onRestart(){
        super.onRestart()
        Log.d(TAG, className + ".onRestart() Chamado")

    }
    override fun onResume(){
        super.onResume()
        Log.d(TAG, className + ".onResume() Chamado")
    }
    override fun onPause(){
        super.onPause()
        Log.d(TAG, className + ".onPause() Chamado")
    }

    override fun onSaveInstanceState(outState: Bundle){
        super.onSaveInstanceState(outState)
        Log.d(TAG, className + "onSaveInstanceState() Chamado")
    }
    override fun onStop(){
        super.onStop()
        Log.d(TAG, className + ".onStop() Chamado")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, className + ".onDestroy() Chamado")

    }
}
