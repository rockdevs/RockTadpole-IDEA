package az.rock.ide.engine.theme;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkContrastIJTheme;

import javax.swing.*;

public enum Theme
{
    DRACULA{
        @Override
        public LookAndFeel get() {
            return new FlatDarculaLaf();
        }
    },LIGHT{
        @Override
        public LookAndFeel get() {
            return new FlatLightLaf();
        }
    },ARC_DARK{
        @Override
        public LookAndFeel get() {
            return new FlatArcDarkContrastIJTheme();
        }
    },ARC{
    @Override
    public LookAndFeel get() {
        return new FlatArcIJTheme();
    }
    },
    CARBON{
        @Override
        public LookAndFeel get() {
            return new FlatCarbonIJTheme();
        }
    },
    GITHUB_DARK_CONTRAST{
        @Override
        public LookAndFeel get() {
            return new FlatGitHubDarkContrastIJTheme();
        }
    },
    ATOM_DARK_CONTRAST{
        @Override
        public LookAndFeel get() {
            return new FlatAtomOneDarkContrastIJTheme();
        }
    },
    ATOM_LIGHT_CONTRAST{
        @Override
        public LookAndFeel get() {
            return new FlatAtomOneLightContrastIJTheme();
        }
    },
    ARC_DARK_ORANGE{
        @Override
        public LookAndFeel get() {
            return new FlatArcDarkOrangeIJTheme();
        }
    };

    public abstract LookAndFeel get();
}
