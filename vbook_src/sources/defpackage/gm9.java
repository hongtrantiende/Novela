package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gm9  reason: default package */
/* loaded from: classes3.dex */
public final class gm9 implements Serializable {
    public final Pattern a;

    public gm9(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((hm9) it.next()).a;
        }
        Pattern compile = Pattern.compile("<img[^>]+src=\"([^\"]+)\"", h88.h(i));
        compile.getClass();
        this.a = compile;
    }

    public static b27 b(gm9 gm9Var, String str) {
        gm9Var.getClass();
        str.getClass();
        Matcher matcher = gm9Var.a.matcher(str);
        matcher.getClass();
        return p1d.f(matcher, 0, str);
    }

    public static ki4 c(gm9 gm9Var, CharSequence charSequence) {
        gm9Var.getClass();
        charSequence.getClass();
        if (charSequence.length() >= 0) {
            return new ki4(1, new mm7(20, gm9Var, charSequence), em9.a);
        }
        cp8.k(charSequence.length(), hl5.s("Start index out of bounds: ", ", input length: ", 0));
        return null;
    }

    public final boolean a(String str) {
        str.getClass();
        return this.a.matcher(str).find();
    }

    public final String d() {
        String pattern = this.a.pattern();
        pattern.getClass();
        return pattern;
    }

    public final b27 e(int i, String str) {
        str.getClass();
        Matcher region = this.a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new b27(region, str);
        }
        return null;
    }

    public final b27 f(String str) {
        str.getClass();
        Matcher matcher = this.a.matcher(str);
        matcher.getClass();
        if (!matcher.matches()) {
            return null;
        }
        return new b27(matcher, str);
    }

    public final boolean g(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final String h(CharSequence charSequence, xt4 xt4Var) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        int i = 0;
        b27 f = p1d.f(matcher, 0, charSequence);
        if (f == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, f.b().a);
            sb.append((CharSequence) xt4Var.invoke(f));
            i = f.b().b + 1;
            f = f.d();
            if (i >= length) {
                break;
            }
        } while (f != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final String i(CharSequence charSequence, String str) {
        charSequence.getClass();
        String replaceAll = this.a.matcher(charSequence).replaceAll(str);
        replaceAll.getClass();
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }

    public gm9(String str, int i) {
        Pattern compile = Pattern.compile(str, h88.h(2));
        compile.getClass();
        this.a = compile;
    }

    public gm9(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.a = compile;
    }
}
