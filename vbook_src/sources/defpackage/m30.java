package defpackage;

import java.io.File;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m30  reason: default package */
/* loaded from: classes3.dex */
public final class m30 extends aab implements xt4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(String str, List list, m42 m42Var) {
        super(1, m42Var);
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new m30(this.a, this.b, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        return ((m30) create((m42) obj)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        File file;
        hre.r(obj);
        Path path = Paths.get(this.a, new String[0]);
        path.getClass();
        ow6 ow6Var = y56.a;
        File file2 = path.toFile();
        file2.getClass();
        if (y56.a(file2)) {
            file = file2;
        } else {
            file = null;
        }
        if (file != null) {
            Path path2 = file.toPath();
            OpenOption[] openOptionArr = (OpenOption[]) this.b.toArray(new OpenOption[0]);
            return AsynchronousFileChannel.open(path2, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        }
        throw new ik1(file2);
    }
}
