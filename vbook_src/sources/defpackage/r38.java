package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r38  reason: default package */
/* loaded from: classes.dex */
public final class r38 {
    public static final r38 a;
    public static final r38 b;
    public static final /* synthetic */ r38[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r38] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r38] */
    static {
        ?? r0 = new Enum("Width", 0);
        a = r0;
        ?? r1 = new Enum("Height", 1);
        b = r1;
        c = new r38[]{r0, r1};
    }

    public static r38 valueOf(String str) {
        return (r38) Enum.valueOf(r38.class, str);
    }

    public static r38[] values() {
        return (r38[]) c.clone();
    }
}
