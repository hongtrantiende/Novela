package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s65  reason: default package */
/* loaded from: classes3.dex */
public final class s65 {
    public static final s65 a;
    public static final s65 b;
    public static final /* synthetic */ s65[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [s65, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [s65, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Undo", 0);
        a = r0;
        ?? r1 = new Enum("Redo", 1);
        b = r1;
        c = new s65[]{r0, r1};
    }

    public static s65 valueOf(String str) {
        return (s65) Enum.valueOf(s65.class, str);
    }

    public static s65[] values() {
        return (s65[]) c.clone();
    }
}
