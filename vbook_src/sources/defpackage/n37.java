package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n37  reason: default package */
/* loaded from: classes.dex */
public final class n37 {
    public static final n37 a;
    public static final n37 b;
    public static final /* synthetic */ n37[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [n37, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [n37, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Width", 0);
        a = r0;
        ?? r1 = new Enum("Height", 1);
        b = r1;
        c = new n37[]{r0, r1};
    }

    public static n37 valueOf(String str) {
        return (n37) Enum.valueOf(n37.class, str);
    }

    public static n37[] values() {
        return (n37[]) c.clone();
    }
}
