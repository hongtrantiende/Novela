package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nh1  reason: default package */
/* loaded from: classes3.dex */
public final class nh1 {
    public static final nh1 a;
    public static final nh1 b;
    public static final /* synthetic */ nh1[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nh1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nh1] */
    static {
        ?? r0 = new Enum("CBC", 0);
        a = r0;
        ?? r1 = new Enum("ECB", 1);
        b = r1;
        c = new nh1[]{r0, r1};
    }

    public static nh1 valueOf(String str) {
        return (nh1) Enum.valueOf(nh1.class, str);
    }

    public static nh1[] values() {
        return (nh1[]) c.clone();
    }
}
