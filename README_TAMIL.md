# Tamil Nature Vattikadai Magic – Android APK

இந்த project, Version 12 HTML app-ஐ Android WebView app-ஆக package செய்கிறது. App offline-லும் இயங்கும் வகையில் HTML file assets-ல் வைக்கப்பட்டுள்ளது.

## GitHub மூலம் APK உருவாக்குவது

1. GitHub-ல் புதிய repository உருவாக்கவும். உதாரணம்: `tamil-nature-vattikadai-magic`
2. இந்த ZIP-ஐ extract செய்து உள்ளே இருக்கும் எல்லா files/folders-ஐ repository-க்கு upload செய்யவும்.
3. GitHub repository-ல் **Actions** tab திறக்கவும்.
4. `Build Android APK` workflow-ஐ தேர்வு செய்து **Run workflow** அழுத்தவும். `main` branch-க்கு push செய்தாலும் build தானாக தொடங்கும்.
5. Build முடிந்ததும் workflow run-ஐ திறந்து **Artifacts** பகுதியில் `Tamil-Nature-Vattikadai-Magic-APK`-ஐ download செய்யவும்.
6. ZIP-ஐ extract செய்து `app-debug.apk`-ஐ Android phone-ல் install செய்யவும். தேவையானால் அந்த browser/file manager-க்கு “Install unknown apps” அனுமதி கொடுக்கவும்.

## App விவரங்கள்

- App name: Tamil Nature Vattikadai Magic
- Package ID: `com.tamilnature.vattikadaimagic`
- Minimum Android: Android 6.0 (API 23)
- HTML asset: `app/src/main/assets/index.html`

இது debug APK. Public Play Store release-க்கு தனி signing key மற்றும் release build அமைப்பு தேவை.
