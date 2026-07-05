package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z29  reason: default package */
/* loaded from: classes.dex */
public final class z29 {
    public static final z29 a;
    public static final z29 b;
    public static final /* synthetic */ z29[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [z29, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [z29, java.lang.Enum] */
    static {
        ?? r0 = new Enum("EXACT", 0);
        a = r0;
        ?? r1 = new Enum("INEXACT", 1);
        b = r1;
        c = new z29[]{r0, r1};
    }

    public static z29 valueOf(String str) {
        return (z29) Enum.valueOf(z29.class, str);
    }

    public static z29[] values() {
        return (z29[]) c.clone();
    }
}
