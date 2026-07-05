package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: st3  reason: default package */
/* loaded from: classes.dex */
public final class st3 {
    public static final st3 a;
    public static final st3 b;
    public static final st3 c;
    public static final /* synthetic */ st3[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [st3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [st3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [st3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PreEnter", 0);
        a = r0;
        ?? r1 = new Enum("Visible", 1);
        b = r1;
        ?? r2 = new Enum("PostExit", 2);
        c = r2;
        d = new st3[]{r0, r1, r2};
    }

    public static st3 valueOf(String str) {
        return (st3) Enum.valueOf(st3.class, str);
    }

    public static st3[] values() {
        return (st3[]) d.clone();
    }
}
