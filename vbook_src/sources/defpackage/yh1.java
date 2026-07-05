package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yh1  reason: default package */
/* loaded from: classes3.dex */
public final class yh1 {
    public static final yh1 a;
    public static final yh1 b;
    public static final yh1 c;
    public static final /* synthetic */ yh1[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [yh1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [yh1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [yh1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NONE", 0);
        a = r0;
        ?? r1 = new Enum("ALL_JSON_OBJECTS", 1);
        b = r1;
        ?? r2 = new Enum("POLYMORPHIC", 2);
        c = r2;
        d = new yh1[]{r0, r1, r2};
    }

    public static yh1 valueOf(String str) {
        return (yh1) Enum.valueOf(yh1.class, str);
    }

    public static yh1[] values() {
        return (yh1[]) d.clone();
    }
}
