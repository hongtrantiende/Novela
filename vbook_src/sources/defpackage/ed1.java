package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ed1  reason: default package */
/* loaded from: classes3.dex */
public final class ed1 {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        a = forName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset forName2 = Charset.forName("US-ASCII");
        forName2.getClass();
        b = forName2;
        Charset forName3 = Charset.forName("ISO-8859-1");
        forName3.getClass();
        c = forName3;
    }
}
