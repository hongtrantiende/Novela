package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w79  reason: default package */
/* loaded from: classes.dex */
public final class w79 {
    public static final w79 a;
    public static final w79 b;
    public static final w79 c;
    public static final /* synthetic */ w79[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w79] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w79] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, w79] */
    static {
        ?? r0 = new Enum("PASS_THROUGH", 0);
        a = r0;
        ?? r1 = new Enum("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = r1;
        ?? r2 = new Enum("DISCARDING", 2);
        c = r2;
        d = new w79[]{r0, r1, r2};
    }

    public static w79 valueOf(String str) {
        return (w79) Enum.valueOf(w79.class, str);
    }

    public static w79[] values() {
        return (w79[]) d.clone();
    }
}
