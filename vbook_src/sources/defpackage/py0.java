package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: py0  reason: default package */
/* loaded from: classes3.dex */
public final class py0 {
    public static final py0 a;
    public static final py0 b;
    public static final py0 c;
    public static final /* synthetic */ py0[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, py0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, py0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, py0] */
    static {
        ?? r0 = new Enum("SUSPEND", 0);
        a = r0;
        ?? r1 = new Enum("DROP_OLDEST", 1);
        b = r1;
        ?? r2 = new Enum("DROP_LATEST", 2);
        c = r2;
        d = new py0[]{r0, r1, r2};
    }

    public static py0 valueOf(String str) {
        return (py0) Enum.valueOf(py0.class, str);
    }

    public static py0[] values() {
        return (py0[]) d.clone();
    }
}
