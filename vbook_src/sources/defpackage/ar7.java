package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ar7  reason: default package */
/* loaded from: classes3.dex */
public final class ar7 {
    public static final hq7 b;
    public static final /* synthetic */ ar7[] c;
    public static final /* synthetic */ qu3 d;
    public final String a;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hq7] */
    static {
        ar7[] ar7VarArr = {new ar7("JANUARY", "Jan", 0), new ar7("FEBRUARY", "Feb", 1), new ar7("MARCH", "Mar", 2), new ar7("APRIL", "Apr", 3), new ar7("MAY", "May", 4), new ar7("JUNE", "Jun", 5), new ar7("JULY", "Jul", 6), new ar7("AUGUST", "Aug", 7), new ar7("SEPTEMBER", "Sep", 8), new ar7("OCTOBER", "Oct", 9), new ar7("NOVEMBER", "Nov", 10), new ar7("DECEMBER", "Dec", 11)};
        c = ar7VarArr;
        d = new qu3(ar7VarArr);
        b = new Object();
    }

    public ar7(String str, String str2, int i) {
        this.a = str2;
    }

    public static ar7 valueOf(String str) {
        return (ar7) Enum.valueOf(ar7.class, str);
    }

    public static ar7[] values() {
        return (ar7[]) c.clone();
    }
}
