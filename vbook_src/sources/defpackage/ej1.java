package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ej1  reason: default package */
/* loaded from: classes.dex */
public final class ej1 {
    public static final ej1 a;
    public static final /* synthetic */ ej1[] b;
    /* JADX INFO: Fake field, exist only in values array */
    ej1 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ej1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ej1] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        a = r1;
        b = new ej1[]{r0, r1};
    }

    public static ej1 valueOf(String str) {
        return (ej1) Enum.valueOf(ej1.class, str);
    }

    public static ej1[] values() {
        return (ej1[]) b.clone();
    }
}
