package com.cpst.bugly;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by wy on 2017/8/10.
 *
 */

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.cpst.bugly.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
