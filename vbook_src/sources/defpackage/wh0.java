package defpackage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wh0  reason: default package */
/* loaded from: classes3.dex */
public final class wh0 extends aab implements xt4 {
    public final /* synthetic */ File a;
    public final /* synthetic */ b6d b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh0(File file, b6d b6dVar, String str, m42 m42Var) {
        super(1, m42Var);
        this.a = file;
        this.b = b6dVar;
        this.c = str;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new wh0(this.a, this.b, this.c, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        return ((wh0) create((m42) obj)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object gs9Var;
        int i;
        hre.r(obj);
        ow6 ow6Var = y56.a;
        File file = this.a;
        boolean exists = file.exists();
        String str = this.c;
        b6d b6dVar = this.b;
        if (exists && y56.a(file)) {
            double lastModified = file.lastModified();
            boolean isDirectory = file.isDirectory();
            long length = file.length();
            try {
                Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(file.toPath(), new LinkOption[0]);
                posixFilePermissions.getClass();
                gs9Var = new Integer(wg4.d(posixFilePermissions));
            } catch (Throwable th) {
                gs9Var = new gs9(th);
            }
            if (gs9Var instanceof gs9) {
                gs9Var = null;
            }
            Integer num = (Integer) gs9Var;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 511;
            }
            return b6d.i(b6dVar, str, isDirectory, length, 0L, i, lastModified, lastModified, lastModified, 14552);
        }
        return b6d.j(b6dVar, str);
    }
}
