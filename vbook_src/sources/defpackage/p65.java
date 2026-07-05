package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p65  reason: default package */
/* loaded from: classes3.dex */
public final class p65 {
    public static final p65 a;
    public static final p65 b;
    public static final /* synthetic */ p65[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p65] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p65] */
    static {
        ?? r0 = new Enum("Undo", 0);
        a = r0;
        ?? r1 = new Enum("Redo", 1);
        b = r1;
        c = new p65[]{r0, r1};
    }

    public static p65 valueOf(String str) {
        return (p65) Enum.valueOf(p65.class, str);
    }

    public static p65[] values() {
        return (p65[]) c.clone();
    }
}
