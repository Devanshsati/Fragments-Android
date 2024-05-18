# Fragments Example

This project demonstrates the usage of multiple fragments within an Android application using Kotlin and ViewBinding. The project includes a `MainActivity` with three buttons to switch between different fragments (`DefaultFragment`, `BlankFragment1`, and `BlankFragment2`).

## Project Structure

### MainActivity

The `MainActivity` class initializes the default fragment (`DefaultFragment`) and sets up button click listeners to switch between `BlankFragment1` and `BlankFragment2`. It uses `ActivityMainBinding` for ViewBinding to inflate the layout and bind the views.

### Fragments

1. **DefaultFragment**: 
   - This is the initial fragment displayed when the application starts.
   - It inflates a simple layout with minimal logic.

2. **BlankFragment1**:
   - Uses `FragmentBlank1Binding` for ViewBinding.
   - Includes a sample Toast message to indicate when the fragment is loaded.

3. **BlankFragment2**:
   - A simple fragment that inflates its layout without additional logic.

## Layout Files

1. **activity_main.xml**:
   - Contains a `FrameLayout` with the ID `frameLayout` to host the fragments.
   - Includes two buttons with IDs `button1` and `button2` to switch between the fragments.

2. **fragment_default.xml**:
   - Layout for `DefaultFragment`.
   - Contains a `TextView` displaying "Default Fragment".

3. **fragment_blank1.xml**:
   - Layout for `BlankFragment1`.
   - Contains a `TextView` displaying "Blank Fragment 1".

4. **fragment_blank2.xml**:
   - Layout for `BlankFragment2`.
   - Contains a `TextView` displaying "Blank Fragment 2".

## Usage

1. **Setup Android Studio**:
   - Open the project in Android Studio.

2. **Run the App**:
   - Execute the app on an emulator or physical device.

3. **Switch Fragments**:
   - Use the buttons in `MainActivity` to switch between `DefaultFragment`, `BlankFragment1`, and `BlankFragment2`.

## Dependencies

- **AndroidX**: Ensure your project is using AndroidX libraries for compatibility.
- **ViewBinding**: Used for binding views in `MainActivity` and `BlankFragment1`.

## Notes

- The default fragment (`DefaultFragment`) is displayed when the app starts.
- Clicking the buttons will replace the current fragment with `BlankFragment1` or `BlankFragment2`.
- `BlankFragment1` includes a Toast message to indicate its loading for demonstration purposes.
