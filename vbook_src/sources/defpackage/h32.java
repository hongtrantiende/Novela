package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h32  reason: default package */
/* loaded from: classes3.dex */
public abstract class h32 {
    public static final Set a = b00.F0(new String[]{"json", "ld+json", "xml", "xhtml+xml", "rss+xml", "atom+xml", "x-www-form-urlencoded", "svg+xml"});

    public static final Charset a(e32 e32Var) {
        e32Var.getClass();
        String b = e32Var.b("charset");
        if (b != null) {
            try {
                Charset charset = ed1.a;
                Charset forName = Charset.forName(b);
                forName.getClass();
                return forName;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    public static final e32 b(e32 e32Var, Charset charset) {
        e32Var.getClass();
        charset.getClass();
        String lowerCase = e32Var.c.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!lowerCase.equals("text")) {
            return e32Var;
        }
        String name = charset.name();
        name.getClass();
        return e32Var.c(name);
    }
}
