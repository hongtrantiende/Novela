package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c33  reason: default package */
/* loaded from: classes3.dex */
public final class c33 {
    public static final c33 a;
    public static final c33 b;
    public static final c33 c;
    public static final /* synthetic */ c33[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [c33, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c33, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [c33, java.lang.Enum] */
    static {
        ?? r0 = new Enum("HIGH", 0);
        a = r0;
        ?? r1 = new Enum("MEDIUM", 1);
        b = r1;
        ?? r2 = new Enum("LOW", 2);
        c = r2;
        d = new c33[]{r0, r1, r2};
    }

    public static c33 valueOf(String str) {
        return (c33) Enum.valueOf(c33.class, str);
    }

    public static c33[] values() {
        return (c33[]) d.clone();
    }
}
