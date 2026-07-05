package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: be4  reason: default package */
/* loaded from: classes.dex */
public class be4 implements rh9 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public be4(pe4 pe4Var, hn8 hn8Var) {
        pe4Var.getClass();
        hn8Var.getClass();
        this.b = pe4Var;
        this.c = hn8Var;
        this.d = new n07(5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[Catch: FileNotFoundException -> 0x008f, TRY_LEAVE, TryCatch #3 {FileNotFoundException -> 0x008f, blocks: (B:48:0x0097, B:40:0x0086), top: B:90:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5 A[Catch: Exception -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x00e6, blocks: (B:74:0x00e5, B:51:0x00a6), top: B:98:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.be4 r7, defpackage.n42 r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be4.c(be4, n42):java.lang.Object");
    }

    @Override // defpackage.rh9
    public final Object b(ex0 ex0Var) {
        switch (this.a) {
            case 0:
                if (!((AtomicBoolean) this.d).get()) {
                    return nc2.b((File) this.b, new ge(this, null, 8), ex0Var);
                }
                vs.k("This scope has already been closed.");
                return null;
            default:
                return c(this, ex0Var);
        }
    }

    @Override // defpackage.gk1
    public final void close() {
        switch (this.a) {
            case 0:
                ((AtomicBoolean) this.d).set(true);
                return;
            default:
                ((AtomicBoolean) ((n07) this.d).b).set(true);
                return;
        }
    }

    public be4(File file, w9a w9aVar) {
        w9aVar.getClass();
        this.b = file;
        this.c = w9aVar;
        this.d = new AtomicBoolean(false);
    }
}
