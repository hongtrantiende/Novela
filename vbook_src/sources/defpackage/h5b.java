package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h5b  reason: default package */
/* loaded from: classes.dex */
public final class h5b {
    public static final h5b a;
    public static final /* synthetic */ h5b[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h5b] */
    static {
        ?? r0 = new Enum("SOLID", 0);
        a = r0;
        b = new h5b[]{r0};
    }

    public static h5b valueOf(String str) {
        return (h5b) Enum.valueOf(h5b.class, str);
    }

    public static h5b[] values() {
        return (h5b[]) b.clone();
    }
}
