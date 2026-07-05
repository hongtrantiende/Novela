package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rm3  reason: default package */
/* loaded from: classes3.dex */
public final class rm3 {
    public static final lh9 a;
    public static final rm3 b;
    public static final rm3 c;
    public static final rm3 d;
    public static final /* synthetic */ rm3[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rm3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rm3] */
    static {
        ?? r0 = new Enum("PHONE", 0);
        c = r0;
        ?? r1 = new Enum("WATCH", 1);
        d = r1;
        e = new rm3[]{r0, r1};
        a = new lh9(23);
        b = r0;
    }

    public static rm3 valueOf(String str) {
        return (rm3) Enum.valueOf(rm3.class, str);
    }

    public static rm3[] values() {
        return (rm3[]) e.clone();
    }
}
