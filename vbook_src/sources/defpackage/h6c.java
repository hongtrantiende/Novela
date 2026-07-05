package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h6c  reason: default package */
/* loaded from: classes3.dex */
public final class h6c implements of9 {
    public static final v28 a;
    public static final h6c b;
    public static final h6c c;
    public static final /* synthetic */ h6c[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h6c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h6c] */
    static {
        ?? r0 = new Enum("LIGHT", 0);
        b = r0;
        ?? r1 = new Enum("DARK", 1);
        c = r1;
        d = new h6c[]{r0, r1};
        a = new v28(6);
    }

    public static h6c valueOf(String str) {
        return (h6c) Enum.valueOf(h6c.class, str);
    }

    public static h6c[] values() {
        return (h6c[]) d.clone();
    }
}
