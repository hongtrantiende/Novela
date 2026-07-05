package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s7e  reason: default package */
/* loaded from: classes.dex */
public final class s7e {
    public static final s7e a;
    public static final /* synthetic */ s7e[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [s7e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [s7e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [s7e, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new s7e[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static s7e[] values() {
        return (s7e[]) b.clone();
    }
}
