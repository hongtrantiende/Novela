package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cjc  reason: default package */
/* loaded from: classes.dex */
public final class cjc {
    public static final jf8 a;
    public static final cjc b;
    public static final cjc c;
    public static final /* synthetic */ cjc[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cjc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cjc] */
    static {
        ?? r0 = new Enum("Native", 0);
        b = r0;
        ?? r1 = new Enum("WebView", 1);
        c = r1;
        d = new cjc[]{r0, r1};
        a = new jf8(6);
    }

    public static cjc valueOf(String str) {
        return (cjc) Enum.valueOf(cjc.class, str);
    }

    public static cjc[] values() {
        return (cjc[]) d.clone();
    }
}
