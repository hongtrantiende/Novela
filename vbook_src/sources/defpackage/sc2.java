package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sc2  reason: default package */
/* loaded from: classes.dex */
public final class sc2 implements vc2 {
    public static final sc2 a;
    public static final sc2 b;
    public static final /* synthetic */ sc2[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [sc2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sc2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("LoadingError", 0);
        a = r0;
        ?? r1 = new Enum("SavingError", 1);
        b = r1;
        c = new sc2[]{r0, r1};
    }

    public static sc2 valueOf(String str) {
        return (sc2) Enum.valueOf(sc2.class, str);
    }

    public static sc2[] values() {
        return (sc2[]) c.clone();
    }
}
