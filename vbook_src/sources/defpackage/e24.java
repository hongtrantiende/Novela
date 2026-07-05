package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e24  reason: default package */
/* loaded from: classes3.dex */
public final class e24 {
    public static final e24 b;
    public static final /* synthetic */ e24[] c;
    public static final /* synthetic */ qu3 d;
    public final String a;

    static {
        e24 e24Var = new e24("Epub", "EPUB 2", 0);
        b = e24Var;
        e24[] e24VarArr = {e24Var, new e24("Epub3", "EPUB 3", 1), new e24("Cbz", "CBZ", 2), new e24("Txt", "TXT", 3), new e24("Html", "HTML", 4)};
        c = e24VarArr;
        d = new qu3(e24VarArr);
    }

    public e24(String str, String str2, int i) {
        this.a = str2;
    }

    public static e24 valueOf(String str) {
        return (e24) Enum.valueOf(e24.class, str);
    }

    public static e24[] values() {
        return (e24[]) c.clone();
    }
}
