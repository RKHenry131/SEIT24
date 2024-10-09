package io.cucumber.skeleton.Utils;

public class Utils {

    private static final String expectedHomePageTitle = "Welcome to the-internet";

    public static String getExpectedHomePageTitle() {
        return expectedHomePageTitle;
    }

    public static String expectedPageList(){
        return """
                A/B Testing
                Add/Remove Elements
                Basic Auth (user and pass: admin)
                Broken Images
                Challenging DOM
                Checkboxes
                Context Menu
                Digest Authentication (user and pass: admin)
                Disappearing Elements
                Drag and Drop
                Dropdown
                Dynamic Content
                Dynamic Controls
                Dynamic Loading
                Entry Ad
                Exit Intent
                File Download
                File Upload
                Floating Menu
                Forgot Password
                Form Authentication
                Frames
                Geolocation
                Horizontal Slider
                Hovers
                Infinite Scroll
                Inputs
                JQuery UI Menus
                JavaScript Alerts
                JavaScript onload event error
                Key Presses
                Large & Deep DOM
                Multiple Windows
                Nested Frames
                Notification Messages
                Redirect Link
                Secure File Download
                Shadow DOM
                Shifting Content
                Slow Resources
                Sortable Data Tables
                Status Codes
                Typos
                WYSIWYG Editor""";
    }
}