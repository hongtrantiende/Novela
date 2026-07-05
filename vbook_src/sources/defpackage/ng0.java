package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ng0  reason: default package */
/* loaded from: classes.dex */
public final class ng0 {
    public static final ng0 a;
    public static final ng0 b;
    public static final /* synthetic */ ng0[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ng0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ng0] */
    static {
        ?? r0 = new Enum("EXPONENTIAL", 0);
        a = r0;
        ?? r1 = new Enum("LINEAR", 1);
        b = r1;
        c = new ng0[]{r0, r1};
    }

    public static ng0 valueOf(String str) {
        return (ng0) Enum.valueOf(ng0.class, str);
    }

    public static ng0[] values() {
        return (ng0[]) c.clone();
    }
}
