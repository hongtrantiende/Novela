package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ikb  reason: default package */
/* loaded from: classes3.dex */
public final class ikb {
    public static final ikb a;
    public static final ikb b;
    public static final ikb c;
    public static final ikb d;
    public static final /* synthetic */ ikb[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [ikb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ikb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ikb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ikb, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Left", 0);
        a = r0;
        ?? r1 = new Enum("Right", 1);
        b = r1;
        ?? r2 = new Enum("Center", 2);
        c = r2;
        ?? r3 = new Enum("None", 3);
        d = r3;
        e = new ikb[]{r0, r1, r2, r3};
    }

    public static ikb valueOf(String str) {
        return (ikb) Enum.valueOf(ikb.class, str);
    }

    public static ikb[] values() {
        return (ikb[]) e.clone();
    }
}
