package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z06  reason: default package */
/* loaded from: classes.dex */
public final class z06 {
    public static final z06 a;
    public static final z06 b;
    public static final /* synthetic */ z06[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [z06, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [z06, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Width", 0);
        a = r0;
        ?? r1 = new Enum("Height", 1);
        b = r1;
        c = new z06[]{r0, r1};
    }

    public static z06 valueOf(String str) {
        return (z06) Enum.valueOf(z06.class, str);
    }

    public static z06[] values() {
        return (z06[]) c.clone();
    }
}
