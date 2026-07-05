package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: si8  reason: default package */
/* loaded from: classes.dex */
public final class si8 {
    public static final si8 a;
    public static final /* synthetic */ si8[] b;
    /* JADX INFO: Fake field, exist only in values array */
    si8 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [si8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [si8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [si8, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Top", 0);
        ?? r1 = new Enum("Center", 1);
        a = r1;
        b = new si8[]{r0, r1, new Enum("Bottom", 2)};
    }

    public static si8 valueOf(String str) {
        return (si8) Enum.valueOf(si8.class, str);
    }

    public static si8[] values() {
        return (si8[]) b.clone();
    }
}
