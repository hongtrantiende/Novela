package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vy6  reason: default package */
/* loaded from: classes.dex */
public final class vy6 {
    public static final vy6 a;
    public static final vy6 b;
    public static final vy6 c;
    public static final /* synthetic */ vy6[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [vy6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [vy6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [vy6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IsPlacedInLookahead", 0);
        a = r0;
        ?? r1 = new Enum("IsPlacedInApproach", 1);
        b = r1;
        ?? r2 = new Enum("IsNotPlaced", 2);
        c = r2;
        d = new vy6[]{r0, r1, r2};
    }

    public static vy6 valueOf(String str) {
        return (vy6) Enum.valueOf(vy6.class, str);
    }

    public static vy6[] values() {
        return (vy6[]) d.clone();
    }
}
