package com.devsoc.icaiefa_2022.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
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
                R.mipmap.prof_bz_tang,
                "https://tangbz.ust.hk/tbz.html"
            ),
            Speaker(
                "Prof. Bin Liu",
                "cheliub@nus.edu.sg",
                "National\nUniversity of\nSingapore",
                R.mipmap.prof_bin_liu,
                "http://cheed.nus.edu.sg/stf/cheliub/"
            ),
            Speaker(
                "Prof. Youhong Tang",
                "youhong.tang@flinders.edu.au",
                "Flinders University,\nAustralia",
                R.mipmap.prof_youhong_tang,
                "https://www.flinders.edu.au/people/youhong.tang"
            ),
            Speaker(
                "Prof. Anjun Qin",
                "msqinaj@scut.edu.cn",
                "South China\nUniversity of\nTechnology",
                R.mipmap.prof_anjun_qin,
                "http://www2.scut.edu.cn/materials_en/2019/0919/c23303a334742/page.htm"
            ),
            Speaker(
                "Prof. Sheshanath V.\nBhosale",
                "svbhosale@unigoa.ac.in",
                "Goa University,\nIndia",
                R.mipmap.prof_sheshanath_v_bhosale,
                "https://www.unigoa.ac.in/faculty/sheshanath-v-bhosale.html"
            ),
            Speaker(
                "Prof. Andrea Pucci",
                "andrea.pucci@unipi.it",
                "University of\nPisa, Italy",
                R.mipmap.prof_andrea_pucci,
                "https://www.dcci.unipi.it/andrea-pucci.html"
            ),
            Speaker(
                "Prof. Samuel W.\nThomas",
                "sam.thomas@tufts.edu",
                "Tuft University,\nMA, USA",
                R.mipmap.prof_samuel_w_thomas,
                "https://ase.tufts.edu/chemistry/Thomas/"
            ),
            Speaker(
                "Prof. Amitava Das",
                "amitava@iiserkol.ac.in",
                "IISER Kolkata,\nIndia",
                R.mipmap.prof_amitava_das,
                "https://www.iiserkol.ac.in/web/en/people/faculty/dcs/amitava/#gsc.tab=0"
            ),
            Speaker(
                "Prof. Vandana Bhalla",
                "vanmanan@yahoo.co.in",
                "Guru Nanak\nDev University,\nIndia",
                R.mipmap.prof_vandana_bhalla,
                "https://online.gndu.ac.in/FacultyProfile/Final_View_Faculty_Proforma.aspx?mid=354456251124451637917034&dpt=516379170"
            ),
            Speaker(
                "Prof. Dilip K. Maiti",
                "dkmchem@caluniv.ac.in",
                "University of\nCalcutta, India",
                R.mipmap.prof_dilip_k_maiti,
                "https://www.chemistrycaluniv.org/"
            ),
            Speaker(
                "Prof. Kazuo Tanaka",
                "tanaka@poly.synchem.kyoto-u.ac.jp",
                "Kyoto University",
                R.mipmap.prof_kazuo_tanaka,
                "https://poly2.synchem.kyoto-u.ac.jp/poly/en/index.cgi?page=Professor+Kazuo+Tanaka"
            ),
            Speaker(
                "Prof. A.C. Bhasikuttan",
                "bkac@barc.gov.in",
                "BARC, India",
                R.mipmap.prof_ac_bhasikuttan,
                "https://scholar.google.co.in/citations?user=uG_Qk1QAAAAJ&hl=en"
            ),
            Speaker(
                "Prof. Abhijit Patra",
                "abhijit@iiserb.ac.in",
                "IISER Bhopal",
                R.mipmap.prof_abhijit_patra,
                "https://www.fmliiserb.com/dr-abhijit-patra"
            ),
            Speaker(
                "Prof. Pradipta\nPurkayastha",
                "ppurkayastha@iiserkol.ac.in",
                "IISER Kolkata",
                R.mipmap.prof_pradipta_purkayastha,
                "https://www.iiserkol.ac.in/web/en/people/faculty/dcs/ppurkayastha/"
            ),
            Speaker(
                "Prof. Rajeev Gupta",
                "rgupta@chemistry.du.ac.in",
                "University of\nDelhi",
                R.mipmap.prof_rajeev_gupta,
                "https://chemistry.du.ac.in/faculty_profile/r_gupta.html"
            ),
            Speaker(
                "Prof. Satish Patil",
                "spatil@iisc.ac.in",
                "IISC Bangalore",
                R.mipmap.prof_satish_patil,
                "https://sscu.iisc.ac.in/patil/"
            ),
            Speaker(
                "Prof. Atul Goel",
                "atul_goel@cdri.res.in",
                "CDRI Lucknow",
                R.mipmap.prof_atul_goel,
                "https://www.cdri.res.in/1537.aspx?id=1537"
            ),
            Speaker(
                "Prof. Apurba L. Koner",
                "akoner@iiserb.ac.in",
                "IISER Bhopal",
                R.mipmap.prof_apurba_koner,
                "https://chm.iiserb.ac.in/faculty_profile.php?id=MjI=&lname=YWtvbmVy"
            ),
            Speaker(
                "Prof. Dokyoung Kim",
                "dkim@khu.ac.kr",
                "Kyung Hee\nUniversity, Seoul,\nKorea",
                R.mipmap.prof_dokyoung_kim,
                "https://www.dkimlab.com/about-me",
            ),
            Speaker(
                "Prof. Rajneesh Mishra",
                "rajneeshmisra@iiti.ac.in",
                "IIT Indore",
                R.mipmap.prof_rajneesh_misra,
                "https://chemistry.iiti.ac.in/people/faculty/prof-rajneesh-misra/"
            ),
            Speaker(
                "Prof. Thomas\nBaumgartner",
                "tbaumgar@yorku.ca",
                "York University,\nCanada",
                R.mipmap.prof_thomas_baumgartner,
                "http://www.yorku.ca/tbaumgar/people/tbaumgar/"
            ),
            Speaker(
                "Prof. Prabhat K. Singh",
                "prabhatk@barc.gov.in",
                "BARC, Mumbai",
                R.mipmap.prof_prabhat_k_singh,
                "https://scholar.google.co.uk/citations?user=tLZ6QKgAAAAJ&hl=en"
            ),
            Speaker(
                "Prof. Ruchi Anand",
                "ruchi@chem.iitb.ac.in",
                "Associate Professor,\nIIT Bombay",
                R.mipmap.prof_ruchi_anand,
                "https://rnd.iitb.ac.in/faculty/prof-ruchi-anand"
            ),
            Speaker(
                "Prof. Moloy Sarkar",
                "msarkar@niser.ac.in",
                "Associate Professor,\nSchool of\nChemical Sciences,\nNational Institute\nof Science Education\nand Research\n(NISER) Bhubaneswar",
                R.mipmap.prof_moloy_sarkar,
                "https://www.niser.ac.in/~msarkar/"
            ),
            Speaker(
                "Prof. Prasenjit Mal",
                "pmal@niser.ac.in",
                "School of\nChemical Sciences,\nNational Institute\nof Science\nEducation and\nResearch (NISER)\nBhubaneswar",
                R.mipmap.prof_prasenjit_mal,
                "https://www.niser.ac.in/users/pmal"
            ),
            Speaker(
                "Prof.S. Philip Anthony",
                "philip@biotech.sastra.edu",
                "Associate Professor,\nSCBT, SASTRA\nDeemed University",
                R.mipmap.prof_s_philip,
                "https://sites.google.com/site/profphilipanthonysgroup/home"
            ),
            Speaker(
                "Prof. Ram K Roy",
                "rkroy@pilani.bits-pilani.ac.in",
                "BITS Pilani,\nPilani Campus",
                R.mipmap.prof_ram_k_roy,
                "https://www.bits-pilani.ac.in/pilani/rkroy/profile"
            ),

            )

        val adapter = SpeakersAdapter(speakersList)
        binding.speakersRvSf.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        adapter.onItemClick = {
            val url: String = it.url
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse(url))
        }

        return binding.root
    }
}