# Add NIM and Name to all screens

The user wants to display NIM and Name on all screens of the application. Currently, there are two screens: `Hal1Screen` and `Hal2Screen`. I will add placeholder text for NIM and Name to both screens.

## Proposed Changes

### Screens

#### [MODIFY] [Hal1Screen.kt](file:///C:/ProjekMobel/Navigation/navigation/app/src/main/java/com/example/compose3/screen/Hal1Screen.kt)
Add Text components for NIM and Name at the top of the Column.

#### [MODIFY] [Hal2Screen.kt](file:///C:/ProjekMobel/Navigation/navigation/app/src/main/java/com/example/compose3/screen/Hal2Screen.kt)
Add Text components for NIM and Name at the top of the Column.

## Verification Plan

### Automated Tests
- None planned as this is a UI change.

### Manual Verification
- Deploy the app and verify that "NIM: [NIM]" and "Nama: [Nama]" are displayed on both screens.
