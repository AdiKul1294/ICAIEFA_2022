package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.adapters.SpeakersAdapter
import com.devsoc.icaiefa_2022.databinding.FragmentSpeakersBinding
import com.devsoc.icaiefa_2022.dataclasses.Speaker

class SpeakersFragment : Fragment() {

    private lateinit var binding: FragmentSpeakersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_speakers, container, false)

        var speakersList = mutableListOf<Speaker>(
            Speaker(
                "Prof. Ben Z Tang",
                "tangbenz@ust.hk",
                "Chinese University\nof Hong Kong\nShenzhen",
                R.mipmap.prof_bz_tang
            ),
            Speaker(
                "Prof. Bin Liu",
                "cheliub@nus.edu.sg",
                "National\nUniversity of\nSingapore",
                R.mipmap.prof_bin_liu
            ),
            Speaker(
                "Prof. Youhong Tang",
                "youhong.tang@flinders.edu.au",
                "Flinders University,\nAustralia",
                R.mipmap.prof_youhong_tang
            ),
            Speaker(
                "Prof. Anjun Qin",
                "msqinaj@scut.edu.cn",
                "South China\nUniversity of\nTechnology",
                R.mipmap.prof_anjun_qin
            ),
            Speaker(
                "Prof. Sheshanath V.\nBhosale",
                "svbhosale@unigoa.ac.in",
                "Goa University,\nIndia",
                R.mipmap.prof_sheshanath_v_bhosale
            ),
            Speaker(
                "Prof. Andrea Pucci",
                "andrea.pucci@unipi.it",
                "University of\nPisa, Italy",
                R.mipmap.prof_andrea_pucci
            ),
            Speaker(
                "Prof. Samuel W.\nThomas",
                "sam.thomas@tufts.edu",
                "Tuft University,\nMA, USA",
                R.mipmap.prof_samuel_w_thomas
            ),
            Speaker(
                "Prof. Amitava Das",
                "amitava@iiserkol.ac.in",
                "IISER Kolkata,\nIndia",
                R.mipmap.prof_amitava_das
            ),
            Speaker(
                "Prof. Vandana Bhalla",
                "vanmanan@yahoo.co.in",
                "Guru Nanak\nDev University,\nIndia",
                R.mipmap.prof_vandana_bhalla
            ),
            Speaker(
                "Prof. Dilip K. Maiti",
                "dkmchem@caluniv.ac.in",
                "University of\nCalcutta, India",
                R.mipmap.prof_dilip_k_maiti
            ),
            Speaker(
                "Prof. Kazuo Tanaka",
                "tanaka@poly.synchem.kyoto-u.ac.jp",
                "Kyoto University",
                R.mipmap.prof_kazuo_tanaka
            ),
            Speaker(
                "Prof. A.C. Bhasikuttan",
                "bkac@barc.gov.in",
                "BARC, India",
                R.mipmap.prof_ac_bhasikuttan
            ),
            Speaker(
                "Prof. Abhijit Patra",
                "abhijit@iiserb.ac.in",
                "IISER Bhopal",
                R.mipmap.prof_abhijit_patra
            ),
            Speaker(
                "Prof. Pradipta\nPurkayastha",
                "ppurkayastha@iiserkol.ac.in",
                "IISER Kolkata",
                R.mipmap.prof_pradipta_purkayastha
            ),
            Speaker(
                "Prof. Rajeev Gupta",
                "rgupta@chemistry.du.ac.in",
                "University of\nDelhi",
                R.mipmap.prof_rajeev_gupta
            ),
            Speaker(
                "Prof. Satish Patil",
                "spatil@iisc.ac.in",
                "IISC Bangalore",
                R.mipmap.prof_satish_patil
            ),
            Speaker(
                "Prof. Atul Goel",
                "atul_goel@cdri.res.in",
                "CDRI Lucknow",
                R.mipmap.prof_atul_goel
            ),
            Speaker(
                "Prof. Apurba L. Koner",
                "akoner@iiserb.ac.in",
                "IISER Bhopal",
                R.mipmap.prof_apurba_koner
            ),
            Speaker(
                "Prof. Dokyoung Kim",
                "dkim@khu.ac.kr",
                "Kyung Hee\nUniversity, Seoul,\nKorea",
                R.mipmap.prof_dokyoung_kim
            ),
            Speaker(
                "Prof. Rajneesh Mishra",
                "rajneeshmisra@iiti.ac.in",
                "IIT Indore",
                R.mipmap.prof_rajneesh_misra
            ),
            Speaker(
                "Prof. Thomas\nBaumgartner",
                "tbaumgar@yorku.ca",
                "York University,\nCanada",
                R.mipmap.prof_thomas_baumgartner
            ),
            Speaker(
                "Prof. Prabhat K. Singh",
                "prabhatk@barc.gov.in",
                "BARC, Mumbai",
                R.mipmap.prof_prabhat_k_singh
            ),
            Speaker(
                "Prof. Ruchi Anand",
                "ruchi@chem.iitb.ac.in",
                "Associate Professor,\nIIT Bombay",
                R.mipmap.prof_ruchi_anand
            ),
            Speaker(
                "Prof. Moloy Sarkar",
                "msarkar@niser.ac.in",
                "Associate Professor,\nSchool of\nChemical Sciences,\nNational Institute\nof Science Education\nand Research\n(NISER) Bhubaneswar",
                R.mipmap.prof_moloy_sarkar
            ),
            Speaker(
                "Prof. Prasenjit Mal",
                "pmal@niser.ac.in",
                "School of\nChemical Sciences,\nNational Institute\nof Science\nEducation and\nResearch (NISER)\nBhubaneswar",
                R.mipmap.prof_prasenjit_mal
            ),
            Speaker(
                "Prof.S. Philip Anthony",
                "philip@biotech.sastra.edu",
                "Associate Professor,\nSCBT, SASTRA\nDeemed University",
                R.mipmap.prof_s_philip
            ),
            Speaker(
                "Prof. Ram K Roy",
                "rkroy@pilani.bits-pilani.ac.in",
                "BITS Pilani,\nPilani Campus",
                R.mipmap.prof_ram_k_roy
            ),

            )

        val adapter = SpeakersAdapter(speakersList)
        binding.speakersRvSf.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(requireContext())


            return binding.root
        }
    }
}