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

    public static String expectedExamplesTableOne(){
        return """
                Last Name First Name Email Due Web Site Action
                Smith John jsmith@gmail.com $50.00 http://www.jsmith.com edit delete
                Bach Frank fbach@yahoo.com $51.00 http://www.frank.com edit delete
                Doe Jason jdoe@hotmail.com $100.00 http://www.jdoe.com edit delete
                Conway Tim tconway@earthlink.net $50.00 http://www.timconway.com edit delete""";
    }
}