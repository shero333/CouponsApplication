package com.example.couponsapplication.authentication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.couponsapplication.databinding.ActivitySigninBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider

class SigninActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySigninBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySigninBinding.inflate(layoutInflater)

        setContentView(binding.root)


    }

//    private fun signin_user_otp(otp: String, otp_byUser: String) {
//        val phoneAuthCredential = PhoneAuthProvider.getCredential(otp, otp_byUser)
//        FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential)
//            .addOnCompleteListener { task ->
//                binding.continueButton.setVisibility(View.VISIBLE)
//                binding.progressbarOtp.setVisibility(View.INVISIBLE)
//                if (task.isSuccessful) {
//                    val dashboard = Intent(getContext(), MainScreen::class.java)
//                    dashboard.flags = Intent.FLAG_ACTIVITY_NEW_TASK or
//                            Intent.FLAG_ACTIVITY_CLEAR_TASK
//                    startActivity(dashboard)
//                    getActivity().finish()
//                    Toast.makeText(context, "Login Successful!", Toast.LENGTH_LONG).show()
//                } else {
//                    Toast.makeText(context, "Enter Correct OTP!", Toast.LENGTH_LONG).show()
//                }
//            }
//    }
//
//    fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        mViewModel = ViewModelProvider(this).get(PhoneAuthViewModel::class.java)
//        // TODO: Use the ViewModel
//    }
//
//    fun movetonexttext() {
//        binding.otp1.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
//            override fun onTextChanged(sequence: CharSequence, i: Int, i1: Int, i2: Int) {
//                if (!sequence.toString().trim { it <= ' ' }.isEmpty()) binding.otp2.requestFocus()
//            }
//
//            override fun afterTextChanged(editable: Editable) {}
//        })
//        binding.otp2.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
//            override fun onTextChanged(sequence: CharSequence, i: Int, i1: Int, i2: Int) {
//                if (!sequence.toString().trim { it <= ' ' }.isEmpty()) binding.otp2.requestFocus()
//            }
//
//            override fun afterTextChanged(editable: Editable) {}
//        })
//        binding.otp3.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
//            override fun onTextChanged(sequence: CharSequence, i: Int, i1: Int, i2: Int) {
//                if (!sequence.toString().trim { it <= ' ' }.isEmpty()) binding.otp3.requestFocus()
//            }
//
//            override fun afterTextChanged(editable: Editable) {}
//        })
//        binding.otp4.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
//            override fun onTextChanged(sequence: CharSequence, i: Int, i1: Int, i2: Int) {
//                if (!sequence.toString().trim { it <= ' ' }.isEmpty()) binding.otp4.requestFocus()
//            }
//
//            override fun afterTextChanged(editable: Editable) {}
//        })
//        binding.otp5.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
//            override fun onTextChanged(sequence: CharSequence, i: Int, i1: Int, i2: Int) {
//                if (!sequence.toString().trim { it <= ' ' }.isEmpty()) binding.otp5.requestFocus()
//            }
//
//            override fun afterTextChanged(editable: Editable) {}
//        })
//        binding.otp6.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
//            override fun onTextChanged(sequence: CharSequence, i: Int, i1: Int, i2: Int) {
//                if (!sequence.toString().trim { it <= ' ' }.isEmpty()) binding.otp6.requestFocus()
//            }
//
//            override fun afterTextChanged(editable: Editable) {}
//        })
//    }
}