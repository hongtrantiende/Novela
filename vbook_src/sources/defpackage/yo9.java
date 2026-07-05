package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yo9  reason: default package */
/* loaded from: classes.dex */
public final class yo9 {
    public static final yo9 a;
    public static final yo9 b;
    public static final /* synthetic */ yo9[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [yo9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [yo9, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Restart", 0);
        a = r0;
        ?? r1 = new Enum("Reverse", 1);
        b = r1;
        c = new yo9[]{r0, r1};
    }

    public static yo9 valueOf(String str) {
        return (yo9) Enum.valueOf(yo9.class, str);
    }

    public static yo9[] values() {
        return (yo9[]) c.clone();
    }
}
