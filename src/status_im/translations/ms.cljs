(ns status-im.translations.ms)

(def translations
  {
   ;common
   :members-title                         "Pengguna"
   :not-implemented                       "Tidak dilaksanakan"
   :chat-name                             "Nama chat"
   :notifications-title                   "Pemberitahuan"
   :offline                               "Offline"

   ;drawer
   :invite-friends                        "Jemputan rakan"
   :faq                                   "Soalan Lazim"
   :switch-users                          "Pertukaran pengguna"

   ;chat
   :is-typing                             "Sedang manaip"
   :and-you                               "Anda"
   :search-chat                           "Carian chat"
   :members                               {:one   "1 Pengguna"
                                           :other "{{count}}Pengguna"
                                           :zero  "Tiada Pengguna"}
   :members-active                        {:one   "1 Pengguna，1 Aktif"
                                           :other "{{count}}Pengguna，{{count}}Aktif"
                                           :zero  "Tiada Pengguna"}
   :active-online                         "Online"
   :active-unknown                        "Tidak diketahui"
   :available                             "Tersedia"
   :no-messages                           "Tiada mesej"
   :suggestions-requests                  "Permintaan"
   :suggestions-commands                  "Arahan"

   ;sync
   :sync-in-progress                      "Penyegerakan dalam pelaksanaan…"
   :sync-synced                           "Penyegerakan telah dilaksanakan"

   ;messages
   :status-sending                        "Sedang hantar"
   :status-pending                        "Belum hantar"
   :status-sent                           "Sudah hantar"
   :status-seen-by-everyone               "Dilihat oleh semua orang"
   :status-seen                           "Dilihat"
   :status-delivered                      "Sudah sampai"
   :status-failed                         "Gagal"

   ;datetime
   :datetime-second                       {:one   "Saat"
                                           :other "Saat"}
   :datetime-minute                       {:one   "Minit"
                                           :other "Minit"}
   :datetime-hour                         {:one   "Jam"
                                           :other "Jam"}
   :datetime-day                          {:one   "Hari"
                                           :other "Hari"}
   :datetime-multiple                     "s"
   :datetime-ago                          "yang lalu"
   :datetime-yesterday                    "Semalam"
   :datetime-today                        "Hari ini"

   ;profile
   :profile                               "Profil"
   :report-user                           "Lapor pengguna"
   :message                               "Mesej"
   :username                              "Name pengguna"
   :not-specified                         "Tidak ditentukan"
   :public-key                            "Kunci Awam"
   :phone-number                          "Nombor telefon"
   :email                                 "E-mel"
   :profile-no-status                     "Tiada status"
   :add-to-contacts                       "Tambah ke kenalan"
   :error-incorrect-name                  "Pilih nama lain"
   :error-incorrect-email                 "E-mel tidak betul"

   ;;make_photo
   :image-source-title                    "Imej profil"
   :image-source-make-photo               "Tangkap"
   :image-source-gallery                  "Pilih dari galeri"
   :image-source-cancel                   "Batal"

   ;sign-up
   :contacts-syncronized                  "Kenalan anda telah disegerakkan"
   :confirmation-code                     (str "Terima kasih! Kami telah menghantar mesej dengan pengesahan "
                                               "kod. Sila berikan kod tersebut untuk pengesahan telefon nombor anda")
   :incorrect-code                        (str "Maaf, kod tidak betul, sila masukkan lagi")
   :generate-passphrase                   (str "Saya akan menjanakan frasa laluan kepada anda supaya anda boleh mengembalikan "
                                               "akses atau log masuk dari peranti lain")
   :phew-here-is-your-passphrase          "*Phew* Susahnya, ini frasa laluan anda, *Catat ini and selamatkannya!* Anda akan memerlukan ini untuk mendapat semula akaun anda."
   :here-is-your-passphrase               "Ini adalah frasa laluan anda,*Catat ini, selamatkannya!*Anda akan memerlukan ini untuk mendapat semula akaun anda."
   :written-down                          "Pastikan anda telah catat ini dengan selamat"
   :phone-number-required                 "Ketik sini untuk masukkan telefon nombor anda, saya akan mencari kawan-kawan anda"
   :intro-status                          "Bersembang dengan saya untuk setup akaun anda dan menukar tetapan anda"
   :intro-message1                        "Selamat datang ke Status\nKetip mesej ini untuk menetapkan kata laluan anda dan bermula!"
   :account-generation-message            "Berikan saya sedikit masa, saya perlu melakukan matematik dengan gila untuk menjana akaun anda!"
   
   ;chats
   :chats                                 "Chats"
   :new-chat                              "Chat yang baru"
   :new-group-chat                        "Kumpulan chat yang baru"

   ;discover
   :discover                              "Cari"
   :none                                  "Tiada"
   :search-tags                           "Taip tag carian anda di sini"
   :popular-tags                          "Tag popular"
   :recent                                "Terkini"
   :no-statuses-discovered                "No status ditemui"

   ;settings
   :settings                              "Tetapan"

   ;contacts
   :contacts                              "Kenalan"
   :new-contact                           "Kenalan baru"
   :show-all                              "Tunjukan semua"
   :contacts-group-dapps                  "ÐApps"
   :contacts-group-people                 "Orang"
   :contacts-group-new-chat               "Mula chat baru"
   :no-contacts                           "Tiada kenalan lagi"
   :show-qr                               "Tunjuk QR"

   ;group-settings
   :remove                                "Pindah"
   :save                                  "Simpan"
   :change-color                          "Tukar warna"
   :clear-history                         "Padamkan sejarah"
   :delete-and-leave                      "Padam dan tinggal"
   :chat-settings                         "Tetapan chat"
   :edit                                  "Edit"
   :add-members                           "Tambah pengguna"
   :blue                                  "Biru"
   :purple                                "Ungu"
   :green                                 "Hijau"
   :red                                   "Merah"

   ;commands
   :money-command-description             "Kiriman wang"
   :location-command-description          "Hantar lokasi"
   :phone-command-description             "Hantar nombor telefon"
   :phone-request-text                    "Permintaan nombor telefon"
   :confirmation-code-command-description "Hantar kod pengesahan"
   :confirmation-code-request-text        "Permintaan kod pengesahan"
   :send-command-description              "Hantar lokasi"
   :request-command-description           "Hantar permintaan"
   :keypair-password-command-description  ""
   :help-command-description              "Bantuan"
   :request                               "Permintaan"
   :chat-send-eth                         "{{amount}} ETH"
   :chat-send-eth-to                      "Bagi {{chat-name}} {{amount}} ETH"
   :chat-send-eth-from                    "Daripada {{chat-name}} {{amount}} ETH"

   ;new-group
   :group-chat-name                       "Nama Chat"
   :empty-group-chat-name                 "Sila berikan nama"
   :illegal-group-chat-name               "Sila pilih nama lain"

   ;participants
   :add-participants                      "Tambah peserta"
   :remove-participants                   "Padam peserta"

   ;protocol
   :received-invitation                   "Sudah menerima jemputan"
   :removed-from-chat                     "Anda sudah dikeluari dari kumpulan chat"
   :left                                  "Tinggal"
   :invited                               "Sudah dijemput"
   :removed                               "Sudah dipadam"
   :You                                   "Anda"

   ;new-contact
   :add-new-contact                       "Tambah kenalan baru"
   :import-qr                             "Import"
   :scan-qr                               "Imbaskan QR"
   :name                                  "Tunjukan QR"
   :whisper-identity                      "Pengenalan Whisper"
   :address-explication                   "Mungkin beberapa teks sini boleh menjelaskan apakah alamat dan mana mencarinya"
   :enter-valid-address                   "Sila masukkan alamat yang sah atau imbaskan QR kod"
   :contact-already-added                 "Kenalan telah ditambah"
   :can-not-add-yourself                  "Tidak boleh menambah sendiri"
   :unknown-address                       "Alamat tidak diketahui"

   ;login
   :connect                               "Sambung"
   :address                               "Alamat"
   :password                              "Kata laluan"
   :login                                 "Log masuk"
   :wrong-password                        "Salah kata laluan"

   ;recover
   :recover-from-passphrase               "Pemulihan dengan frasa laluan"
   :recover-explain                       "Sila masukkan frasa laluan untuk kata laluan anda supaya dapatkan akses semula"
   :passphrase                            "Frasa laluan"
   :recover                               "Pemulihan"
   :enter-valid-passphrase                "Sila masukkan frasa laluan"
   :enter-valid-password                  "Sila masukkan kata laluan"

   ;accounts
   :recover-access                        "Memulihkan akses"
   :add-account                           "Tambah akaun"

   ;wallet-qr-code
   :done                                  "Dilakukan"
   :main-wallet                           "Beg duit utama"

   ;validation
   :invalid-phone                         "Nombor telefon yang tidak sah"
   :amount                                "Jumlah"
   :not-enough-eth                        (str "Tidak cukup ETH dalam keseimbangan"
                                               "({{balance}} ETH)")
   ;transactions
   :confirm-transactions                  {:one   "Sesahkan transaksi"
                                           :other "Sesahkan{{count}}transaksi"
                                           :zero  "Tiada transaksi"}
   :status                                "Status"
   :pending-confirmation                  "Menunggu pengesahan"
   :recipient                             "Penerima"
   :one-more-item                         "Satu item lagi"
   :fee                                   "Bayaran"
   :value                                 "Nilai"

   ;:webview
   :web-view-error                        "Oops, kesilapan"})
