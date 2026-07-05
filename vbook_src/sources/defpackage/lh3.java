package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lh3  reason: default package */
/* loaded from: classes.dex */
public final class lh3 {
    public static final lh3 a;
    public static final lh3 b;
    public static final lh3 c;
    public static final /* synthetic */ lh3[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lh3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lh3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lh3] */
    static {
        ?? r0 = new Enum("Yes", 0);
        a = r0;
        ?? r1 = new Enum("No", 1);
        b = r1;
        ?? r2 = new Enum("NotInitialized", 2);
        c = r2;
        d = new lh3[]{r0, r1, r2};
    }

    public static lh3 valueOf(String str) {
        return (lh3) Enum.valueOf(lh3.class, str);
    }

    public static lh3[] values() {
        return (lh3[]) d.clone();
    }
}
