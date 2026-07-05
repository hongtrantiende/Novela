package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j73  reason: default package */
/* loaded from: classes.dex */
public final class j73 {
    public static final j73 a;
    public static final j73 b;
    public static final j73 c;
    public static final /* synthetic */ j73[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j73] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j73] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j73] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        a = r0;
        ?? r1 = new Enum("Horizontal", 1);
        b = r1;
        ?? r2 = new Enum("Both", 2);
        c = r2;
        d = new j73[]{r0, r1, r2};
    }

    public static j73 valueOf(String str) {
        return (j73) Enum.valueOf(j73.class, str);
    }

    public static j73[] values() {
        return (j73[]) d.clone();
    }
}
