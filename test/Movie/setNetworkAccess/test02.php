#!/usr/bin/php -c.
<?php
$m = new SWFMovie(8);

ming_setscale(1.0);

$m->setNetworkAccess(1);

/* SWF_SHOWFRAME */
$m->nextFrame(); /* end of frame 1 */

/* SWF_END */

$m->save("test02.swf");
?>
