package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v89  reason: default package */
/* loaded from: classes.dex */
public final class v89 {
    public static final v89 a;
    public static final /* synthetic */ v89[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v89] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v89] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v89] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new v89[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v89 valueOf(String str) {
        return (v89) Enum.valueOf(v89.class, str);
    }

    public static v89[] values() {
        return (v89[]) b.clone();
    }
}
