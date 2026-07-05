package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wjc  reason: default package */
/* loaded from: classes.dex */
public final class wjc {
    public static final wjc a;
    public static final wjc b;
    public static final /* synthetic */ wjc[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [wjc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [wjc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [wjc, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DEFERRED", 0);
        a = r0;
        ?? r1 = new Enum("IMMEDIATE", 1);
        b = r1;
        c = new wjc[]{r0, r1, new Enum("EXCLUSIVE", 2)};
    }

    public static wjc valueOf(String str) {
        return (wjc) Enum.valueOf(wjc.class, str);
    }

    public static wjc[] values() {
        return (wjc[]) c.clone();
    }
}
