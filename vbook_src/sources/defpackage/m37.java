package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m37  reason: default package */
/* loaded from: classes.dex */
public final class m37 {
    public static final m37 a;
    public static final m37 b;
    public static final /* synthetic */ m37[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [m37, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m37, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Min", 0);
        a = r0;
        ?? r1 = new Enum("Max", 1);
        b = r1;
        c = new m37[]{r0, r1};
    }

    public static m37 valueOf(String str) {
        return (m37) Enum.valueOf(m37.class, str);
    }

    public static m37[] values() {
        return (m37[]) c.clone();
    }
}
