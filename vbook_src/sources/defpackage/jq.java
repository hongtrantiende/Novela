package defpackage;

import androidx.glance.session.SessionWorker;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jq  reason: default package */
/* loaded from: classes3.dex */
public final class jq extends aab implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq(Object obj, Object obj2, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new jq((lq) obj2, obj, m42Var, 0);
            case 1:
                return new jq((File) obj2, (l6d) obj, m42Var, 1);
            default:
                return new jq((jac) obj2, (SessionWorker) obj, m42Var, 2);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                ((jq) create(m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                return ((jq) create(m42Var)).invokeSuspend(pvcVar);
            default:
                ((jq) create(m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                lq lqVar = (lq) obj3;
                lq.a(lqVar);
                Object d = lqVar.d(obj2);
                lqVar.c.b.setValue(d);
                lqVar.e.setValue(d);
                return pvcVar;
            case 1:
                l6d l6dVar = (l6d) obj2;
                hre.r(obj);
                File file = (File) obj3;
                ow6 ow6Var = y56.a;
                file.getClass();
                if (file.exists() && y56.a(file)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && l6dVar == l6d.CREATE_NEW) {
                    throw new IOException("File " + file + " already exists");
                } else if (!z && !l6dVar.c) {
                    throw new IOException("File " + file + " doesn't exist");
                } else {
                    int ordinal = l6dVar.ordinal();
                    if (ordinal != 0) {
                        str = "rw";
                        if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                            xk5.o();
                            return null;
                        }
                    } else {
                        str = "r";
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
                    if (l6dVar.d) {
                        randomAccessFile.setLength(0L);
                    }
                    if (l6dVar == l6d.APPEND) {
                        randomAccessFile.seek(randomAccessFile.length());
                        return randomAccessFile;
                    }
                    return randomAccessFile;
                }
            default:
                hre.r(obj);
                ((jac) obj3).b(((SessionWorker) obj2).E.c);
                return pvcVar;
        }
    }
}
